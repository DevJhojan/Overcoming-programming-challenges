"""
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
"""

def anagrama(word_one, word_two):
  word_one = word_one.lower()
  word_two = word_two.lower()
  
  array_word_one = list(word_one) 
  array_word_two = list(word_two)

  array_word_one.sort()
  array_word_two.sort()
  
  word_order_one = "".join(array_word_one)
  word_order_two = "".join(array_word_two)

  return word_order_one == word_order_two
  
if __name__ == "__main__":
  string_one = input("input string the firts word:\n")
  string_two = input("input string the secon word:\n")
  is_anagram = anagrama(string_one, string_two)
  if is_anagram:
    print(f"{string_one} is anagram of {string_two}")
  else: 
    print(f"{string_one} is not anagram of {string_two}")