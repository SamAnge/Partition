# Partition
a list partitions in java

Partition est une application permettant de segmenter une liste principale en plusieurs sous-listes selon la taille souhaitée.

Le programme prend deux paramètres en entrée: une liste d'entiers et un entier taille servant à définir le format de sortie.

Il faut se placer dans le répertoire ${buildDir}/libs après la compilation, et taper la commande suivante:

java -jar Partition.jar <liste>, <dimension> ou <liste> représente la liste que l'on souhaite formatter et <dimension> représente

la taille des sous-listes et Partition.jar le livrable.

Le formattage des paramètres d'entrée doit être respecté pour des questions pratiques.

Exemple: java -jar Partition.jar "1", "2", "3", "0", "4", "5", "6", "0", "7", "8", 3 où la liste est "1", "2", "3", "0", "4", "5", "6", "0", "7", "8" et la dimension est 3. 

Ceci donnera le résultat suivant en sortie: [[1, 2, 3], [0, 4, 5], [6, 0, 7], [8]]

J'ai utilisé le jdk 8, Guava et JUnit4.

Temps consacré: 0h30
