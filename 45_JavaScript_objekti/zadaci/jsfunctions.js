var findFirstIndex = function(array, predicate) {

    for (var i = 0; i < array.length; i++) {
        if (predicate(array[i])) {
            return i;
        }
        
    }
    return -1;
}

var fromPairs = function(arrayOfPairs) {
    var object = {};
   
    for (var pair of arrayOfPairs) {
        var key = pair[0];
        var value = pair[1];
        object[key] = value;
    }
    return object;
}

var intersection = function(arrayOfarrays) {



}