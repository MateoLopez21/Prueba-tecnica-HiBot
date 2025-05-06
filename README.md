# Respuestas Parte 2 - Prueba Técnica QA Hibot

## Caso: Envío de Mensajes Masivos (Entorno de Pruebas)

### 1. ¿Qué pruebas harías para validar esta funcionalidad manualmente? 

Para validar la funcionalidad de envío de mensajes masivos manualmente, realizaría las siguientes pruebas:

* **Pruebas de Funcionalidad Básica:**
    *     Verificar que se puedan redactar mensajes con diferentes formatos (texto plano, con enlaces, con emojis).
    *     Probar el envío a grupos de diferentes tamaños (10 usuarios, 100 usuarios, 1000 usuarios).
    *     Validar que los mensajes se envíen correctamente a los usuarios destinatarios.
* **Pruebas de Segmentación de Usuarios:**
    *     Comprobar el envío de mensajes a usuarios filtrados por diferentes criterios (ubicación, edad, preferencias).
    *     Verificar que se excluyan correctamente a los usuarios que no deben recibir el mensaje.
* **Pruebas de Interrupción:**
    *     Interrumpir el envío de mensajes (cancelar, cerrar la aplicación) y verificar que se reanude correctamente o que no queden mensajes pendientes.

### 2. ¿Qué escenarios negativos y positivos considerarías? (mínimo 2 por cada uno)

**Escenarios Positivos:**

*     **Envío exitoso a todos los usuarios destinatarios:** Verificar que todos los usuarios seleccionados reciban el mensaje correctamente y en el tiempo esperado.
*     **Segmentación correcta de usuarios:** Validar que los mensajes se envíen solo a los usuarios que cumplen con los criterios de segmentación definidos.

**Escenarios Negativos:**

*     **Enviar mensajes sin destinatario:** Intentar enviar un mensaje sin destinatarios seleccionados y verificar que se muestre un mensaje de error.
*     **Enviar mensajes con contenido no permitido:** Enviar mensajes con contenido no permitido, puede ser caracteres especiales, scripts o inserción de código, y validar que el sistema lo rechaza correctamente.

### 3. ¿Cómo reportarías un bug si detectas que algunos mensajes no llegan a ciertos usuarios?

Para reportar un bug donde algunos mensajes no llegan a ciertos usuarios, incluiría la siguiente información:

*     **Título del bug:** "Fallo en el envío de mensajes masivos: Algunos usuarios no reciben el mensaje".
*     **Descripción detallada:**
    *     Dar un contexto del problema: "Al enviar un mensaje masivo a un grupo de [cantidad] usuarios, se detectó que [cantidad] usuarios no recibieron el mensaje."
    *     Indicar los pasos para reproducir el bug:
        1.      "Acceder a la funcionalidad de envío de mensajes masivos."
        2.      "Seleccionar el grupo de usuarios [nombre del grupo o criterios de segmentación]."
        3.      "Redactar el mensaje [contenido del mensaje]."
        4.      "Enviar el mensaje."
        5.      "Verificar la recepción del mensaje por parte de los usuarios."
    *     Especificar los resultados esperados y los resultados obtenidos:
        *     "Resultado esperado: Todos los usuarios seleccionados deberían recibir el mensaje."
        *     "Resultado obtenido: Los siguientes usuarios no recibieron el mensaje: [lista de usuarios o identificadores]."
    *     Incluir cualquier información adicional relevante:
        *     "Fecha y hora del envío."
        *     "Entorno de pruebas utilizado."
*     **Evidencia:** Adjuntar capturas de pantalla, grabaciones de pantalla o logs que demuestren el problema.
