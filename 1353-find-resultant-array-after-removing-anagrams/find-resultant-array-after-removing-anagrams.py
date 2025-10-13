class Solution(object):
    def removeAnagrams(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        def is_anagram(w1, w2):
            return sorted(w1) == sorted(w2)

        result = []
        for word in words:
            if result and is_anagram(result[-1], word):
                continue  # skip this word if it's an anagram of the last one
            result.append(word)
        return result
