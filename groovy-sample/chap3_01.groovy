def map = [:]

new File("test001.txt").eachLine 
{
    it.split(/\s+/).each {
        map[it] = (map[it] == null ? 1 : map[it] + 1)
    }
}

map.entrySet().sort{
    it.value
}.each 
{
    println "${it.value}: [${it.key}]"
}
