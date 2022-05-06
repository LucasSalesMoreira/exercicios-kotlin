import tests.poo.*
import kotlin.collections.ArrayList
import java.util.Random

fun main() {
    val gerentesArray = ArrayList<Gerente>()
    val t1 = Thread() {
        while (true) {
            val gerente = Gerente(
                "Lucas",
                20,
                'M',
                "DEV",
                5,
                575
            )
            gerentesArray.add(gerente);
            println("T1 ::> ${gerentesArray.size}")
            println(Random().nextInt(10))
            //Thread.sleep(5000)
        }
    }

    val t2 = Thread() {
        while (true) {
            val gerente = Gerente(
                "Lucas",
                20,
                'M',
                "DEV",
                5,
                575
            )
            gerentesArray.add(gerente);
            println("T2 ::> ${gerentesArray.size}")
            println(Random().nextInt(10))
            //Thread.sleep(3000)
        }
    }

    val t3 = Thread() {
        while (true) {
            val gerente = Gerente(
                "Lucas",
                20,
                'M',
                "DEV",
                5,
                575
            )
            gerentesArray.add(gerente);
            println("T3 ::> ${gerentesArray.size}")
            println(Random().nextInt(10))
            //Thread.sleep(1000)
        }
    }

    t1.start()
    t2.start()
    t3.start()
    println("GO!!!")
}