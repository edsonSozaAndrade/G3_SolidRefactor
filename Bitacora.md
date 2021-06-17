## Modificación del código ##

- Separación de contenidos: Creación de clases que deriven de Item de acuerdo a las características de actualización de su Quality.
- Override del método compartido updateQuality de acuerdo a las condiciones propias.
- Creación de un Util que permita la verificación final de los límites del Quality.
- Adición de la clase Conjured y las condiciones de updateQuality.
- Modificación de la clase principal para crear items a partir de sus clases específicas.
- Simplificación del método updateQuality en la clase principal.

## Code Smells ##
- God object : La clase GildedRose comienza a tomar demasiadas responsabilidades y se tiende a convertir en un god class
- Duplicated code: El método UpdateQuality tiene código duplicado relacionado a las condiciones que en este caso se desarrollan por item no por objeto de clase.
- Long Method: El método tiene la tendencia a crecer exponencialmente conforme se agreguen items nuevos.

## Principios no respetados ##

- S -> El método updateQuality no conserva una responsabilidad y se encuenta bastante abierto a modificaciones
- O -> Con la implementación anterior es fácilmente predecible modificar la clase principal para adicional nuevos tipos haciendo que el método crezca exponencialmente conforme se van agregando nuevos items al método