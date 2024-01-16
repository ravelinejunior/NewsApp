package com.raveline.newsapp.domain.model

import androidx.annotation.DrawableRes
import com.raveline.newsapp.R

data class Page(
    val title:String,
    val description:String,
    @DrawableRes val image:Int
)

val pages = listOf(
    Page(
        title = "Broadcast Receiver",
        description = "O Broadcast Receiver é um componente que permite que o seu aplicativo receba e responda a eventos transmitidos pelo sistema ou por outros aplicativos, mesmo quando o seu aplicativo não está em execução. Por exemplo, você pode usar um Broadcast Receiver para iniciar o seu aplicativo quando o dispositivo é ligado, ou para mostrar uma notificação quando a bateria está baixa, ou para executar uma tarefa quando o usuário conecta o carregador.",
        image = R.drawable.onboarding1
    ),
    Page(
        title ="Content Provider",
        description = "O Content Provider é um componente que permite que o seu aplicativo compartilhe e acesse dados de outros aplicativos, usando um mecanismo baseado em URIs3. Por exemplo, você pode usar um Content Provider para ler e escrever contatos, fotos, músicas, mensagens e outros tipos de dados que são gerenciados por outros aplicativos." ,
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Pending Intent",
        description = "PendingIntent é um objeto que permite adiar a execução de um intent para um momento posterior, geralmente em resposta a um evento externo. Por exemplo, você pode usar um pendingIntent para iniciar uma atividade quando o usuário clica em uma notificação, ou para iniciar um serviço quando o alarme dispara, ou para enviar um broadcast quando o usuário completa uma ação.",
        image = R.drawable.onboarding3
    ),
    Page(
        title = "Intent Filter",
        description = "IntentFilter é um objeto que permite filtrar os intents que um componente do app pode receber e processar, baseado na ação, nos dados e na categoria do intent. Por exemplo, você pode usar um intentFilter para declarar que uma atividade pode lidar com intents de compartilhamento, ou que um broadcast receiver pode lidar com intents de bateria baixa, ou que um serviço pode lidar com intents de reprodução de mídia.",
        image = R.drawable.onboarding1
    )
)
