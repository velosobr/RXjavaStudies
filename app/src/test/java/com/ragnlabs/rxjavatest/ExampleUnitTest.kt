package com.ragnlabs.rxjavatest

import android.annotation.SuppressLint
import io.reactivex.Observable
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @SuppressLint("CheckResult")
    @Test
    fun `Cria um observable que emite apenas um item`() {
        Observable.just("Hello RX")
            .subscribe { stringMessageItem -> println(stringMessageItem) }
    }

    @SuppressLint("CheckResult")
    @Test
    fun `Cria um observable que emite items do metodo fromArray`() {
        Observable.fromArray("Google", "Microsoft", "Apple")
            .subscribe { itemFromArray -> println(itemFromArray) }
    }

    @SuppressLint("CheckResult")
    @Test
    fun `Cria um observable que emite items do metodo fromIterable`() {
        Observable.fromArray(listOf("Google", "Microsoft", "Apple"))
            .subscribe(
                { itemIterabled -> println(itemIterabled) },          // onNext
                { e -> println("Erro") }, // onError
                { println("Complete") }   // onComplete
            )
    }

}