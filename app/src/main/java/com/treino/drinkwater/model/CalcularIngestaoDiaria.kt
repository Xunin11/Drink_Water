package com.treino.drinkwater.model

class CalcularIngestaoDiaria {

    private val ML_JOVEM = 40.0
    private val ML_ADULTO = 35.0
    private val ML_IDOSO = 30.0
    private val ML_66MAIS = 25.0

    private var resultadoML = 0.0
    private var resultado_total_ml = 0.0

    fun CalcularTotalML(peso: Double, idade:Int){

        if (idade <= 17) {
            resultadoML = peso * ML_JOVEM
            resultado_total_ml = resultadoML
        }else if (idade <= 55) {
            resultadoML = peso * ML_ADULTO
            resultado_total_ml = resultadoML
        }else if (idade <= 65){
            resultado_total_ml = peso * ML_IDOSO
            resultado_total_ml = resultadoML
        }else{
            resultadoML = peso * ML_66MAIS
            resultado_total_ml = resultadoML
        }

    }


    fun ResultadoML(): Double{
        return resultado_total_ml
    }



}