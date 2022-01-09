rm -r ./javadoc/*

javadoc "./src/Main.java" "./src/classes/Arbre.java" "./src/classes/Personne.java" "./src/classes/Membre.java"  "./src/classes/President.java" "./src/classes/Association.java"  -d ./javadoc src.classes src.utiles;

echo ----------------------------------------------------
echo "Javadoc generated in ./javadoc/"
echo ----------------------------------------------------
