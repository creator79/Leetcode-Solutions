/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
     var words = s.split(' ');
    var reversedWords = words.reverse();
    var filteredWords = reversedWords.filter(function(word) {
        return word.length > 0;
    });
    return filteredWords.join(' ');

};