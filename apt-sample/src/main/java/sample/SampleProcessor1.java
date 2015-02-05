package sample;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

import com.sun.source.tree.CompilationUnitTree;
import com.sun.source.tree.MethodTree;
import com.sun.source.tree.VariableTree;
import com.sun.source.util.TreePath;
import com.sun.source.util.TreeScanner;
import com.sun.source.util.Trees;
import com.sun.tools.javac.model.JavacElements;
import com.sun.tools.javac.processing.JavacProcessingEnvironment;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.JCTree.JCExpression;
import com.sun.tools.javac.tree.JCTree.JCVariableDecl;
import com.sun.tools.javac.tree.TreeMaker;

/**
 * Created by akira on 15/01/27.
 */
@SupportedSourceVersion(SourceVersion.RELEASE_6)
@SupportedAnnotationTypes("*") //コンパイル対象の全ソースを対象とする
public class SampleProcessor1 extends AbstractProcessor {

    private Trees trees;
    private TreeMaker maker;
    private JavacElements elements;

    @Override
    public void init(ProcessingEnvironment procEnv) {
        trees = Trees.instance(procEnv);
        JavacProcessingEnvironment env = (JavacProcessingEnvironment)procEnv;
        maker = TreeMaker.instance(env.getContext());
        elements = JavacElements.instance(env.getContext());
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        // コンパイル対象の全ソースを処理
        for (Element e : roundEnv.getRootElements()) {
            CompilationUnitTree u = toUnit(e);
            System.out.println("----> " + u.getSourceFile());
            processUnit(u);
        }
        return false;
    }

    // AST の取得
    private CompilationUnitTree toUnit(Element el) {
        TreePath path = trees.getPath(el);
        return path.getCompilationUnit();
    }
    private void processUnit(CompilationUnitTree cu) {
        // Visitor パターンで AST を処理
        cu.accept(new VarVisitor(), null);
    }


    private class VarVisitor extends TreeScanner<Void, Void> {

        public Void visitMethod(MethodTree node, Void p) {
            JCTree.JCMethodDecl jcMethodDecl = (JCTree.JCMethodDecl) node;
            p = super.visitMethod(node, p);
            return p;
        }
    }
}