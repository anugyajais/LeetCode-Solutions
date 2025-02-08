class NumberContainers {
public:
    NumberContainers() {}
    std::unordered_map<int, std::set<int>> map;
    std::unordered_map<int, int> indexMap;

    void change(int index, int number) {
        if (indexMap.count(index)) {
            int prevNumber = indexMap[index];
            map[prevNumber].erase(index);
            if (map[prevNumber].empty()) {
                map.erase(prevNumber);
            }
        }
        indexMap[index] = number;
        map[number].insert(index);
    }

    int find(int number) {
        return map.count(number) && !map[number].empty() ? *map[number].begin()
                                                         : -1;
    }
};
/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers* obj = new NumberContainers();
 * obj->change(index,number);
 * int param_2 = obj->find(number);
 */