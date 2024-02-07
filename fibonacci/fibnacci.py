"""
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
"""
def fibonacci(limit, number_after, number_before, number_to_sum):
  for i in range(limit):
    i=+1
    if limit > 25:
      print(number_after)
    array.append(number_after)
    number_before += number_to_sum
    number_to_sum = number_after
    number_after = number_before

  if limit <= 25: 
    print(array)

if __name__ == '__main__':
  limit:int = int(input("Into limit: "))
  number_before:int = 0
  number_to_sum: int = 1
  number_after:int = number_before 
  array:list = list()
  fibonacci(limit, number_after, number_before, number_to_sum)
  
