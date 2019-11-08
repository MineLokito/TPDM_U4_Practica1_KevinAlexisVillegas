package mx.edu.ittepic.tpdm_u4_practica1_kevinalexisvillegas


import android.graphics.*
import android.graphics.Color.argb
import android.graphics.Color.rgb
import android.view.View
import android.view.DragEvent

class Lienzo(p:MainActivity) : View(p) {
    var imagen = BitmapFactory.decodeResource(resources, R.drawable.santapequeno)
    var imagenRegalos = BitmapFactory.decodeResource(resources, R.drawable.regalos)
    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()

        setBackgroundColor(Color.rgb(13, 80, 131))
        p.color = Color.rgb(214, 216, 213)
        c.drawCircle(300f, 1180f, 800f, p)
        p.color = Color.rgb(214, 216, 213)
        c.drawCircle(1300f, 1180f, 800f, p)
        //Mono Nieve
        p.color = Color.WHITE
        c.drawCircle(1025f, 730f, 40f, p)
        p.color = Color.WHITE
        c.drawCircle(1025f, 790f, 50f, p)
        p.color = Color.BLACK
        c.drawCircle(1010f, 720f, 5f, p)
        c.drawCircle(1030f, 720f, 5f, p)
        c.drawRect(1010f, 650f, 1045f, 690f, p)
        c.drawRect(995f, 680f, 1060f, 700f, p)
        c.drawRect(995f, 735f, 1055f, 740f, p)


        //Arbol
        p.color = Color.rgb(90, 74, 7)
        c.drawRect(190f, 620f, 240f, 700f, p)
        p.color = Color.rgb(0, 131, 0)
        c.drawCircle(180f, 630f, 40f, p)
        c.drawCircle(250f, 630f, 40f, p)
        c.drawCircle(220f, 580f, 40f, p)

        //Arbol
        p.color = Color.rgb(90, 74, 7)
        c.drawRect(1450f, 620f, 1500f, 700f, p)
        p.color = Color.rgb(0, 131, 0)
        c.drawCircle(1515f, 630f, 40f, p)
        c.drawCircle(1440f, 630f, 40f, p)
        c.drawCircle(1480f, 580f, 40f, p)
        //Luna y santa
        c.drawBitmap(imagen,1300f,30f,p)

        //PINO
        p.color = Color.rgb(90, 74, 7)
        c.drawRect(600f, 620f, 550f, 700f, p)
        p.color = Color.rgb(0, 131, 0)
        c.drawRect(500f, 580f, 650f, 620f, p)
        c.drawRect(520f, 550f, 630f, 620f, p)
        c.drawRect(530f, 530f, 620f, 620f, p)
        c.drawRect(540f, 510f, 610f, 620f, p)
        c.drawRect(550f, 490f, 600f, 620f, p)

        //Letras

        p.color= Color.RED
        p.textSize=70f

        c.drawText("Merry",100f,100f,p)
        p.color= Color.WHITE
        p.textSize=70f
        c.drawText("X-Mass!!♥",200f,150f,p)

        //Estrellas Cielo
        p.color = Color.WHITE
        c.drawCircle(50f, 50f, 2f, p)
        c.drawCircle(200f, 280f, 2f, p)
        c.drawCircle(100f, 200f, 2f, p)
        c.drawCircle(400f, 40f, 2f, p)
        c.drawCircle(450f, 170f, 2f, p)
        c.drawCircle(490f, 110f, 2f, p)
        c.drawCircle(500f, 200f, 2f, p)
        c.drawCircle(540f, 75f, 2f, p)
        c.drawCircle(600f, 120f, 2f, p)
        c.drawCircle(650f, 210f, 2f, p)
        c.drawCircle(940f, 50f, 2f, p)
        c.drawCircle(800f, 140f, 2f, p)
        c.drawCircle(750f, 94f, 2f, p)
        c.drawCircle(1050f, 230f, 2f, p)
        c.drawCircle(1010f, 350f, 2f, p)
        c.drawCircle(1250f, 120f, 2f, p)
        c.drawCircle(1105f, 280f, 2f, p)
        c.drawCircle(1450f, 380f, 2f, p)

        //Esferas
        p.color = Color.RED
        c.drawCircle(530f, 595f, 5f, p)
        p.color = Color.BLUE
        c.drawCircle(620f, 595f, 5f, p)
        p.color = Color.MAGENTA
        c.drawCircle(580f, 595f, 5f, p)
        p.color = Color.CYAN
        c.drawCircle(550f, 565f, 5f, p)
        p.color = Color.RED
        c.drawCircle(580f, 565f, 5f, p)
        p.color = Color.BLUE
        c.drawCircle(615f, 565f, 5f, p)
        p.color = Color.YELLOW
        c.drawCircle(575f, 540f, 5f, p)
        p.color = Color.RED
        c.drawCircle(550f, 540f, 5f, p)
        p.color = Color.YELLOW
        c.drawCircle(605f, 540f, 5f, p)
        p.color = Color.MAGENTA
        c.drawCircle(605f, 540f, 5f, p)
        p.color = Color.RED
        c.drawCircle(580f, 505f, 5f, p)
        p.color = Color.WHITE
        //Regalos
        c.drawBitmap(imagenRegalos,600f,625f,p)
        //Nube
        p.color=Color.WHITE
        c.drawCircle(630f, 205f, 20f, p)
        c.drawCircle(645f, 180f, 20f, p)
        c.drawCircle(655f, 205f, 20f, p)
        c.drawCircle(665f, 185f, 20f, p)
        c.drawCircle(670f, 205f, 20f, p)

        c.drawCircle(930f, 305f, 20f, p)
        c.drawCircle(945f, 280f, 20f, p)
        c.drawCircle(955f, 305f, 20f, p)
        c.drawCircle(965f, 285f, 20f, p)
        c.drawCircle(970f, 305f, 20f, p)


       /* */
        



    }
}