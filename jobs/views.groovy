listView('python') {
    description('python pipelines')
    jobs {
        regex(/.*python.*/)
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}

