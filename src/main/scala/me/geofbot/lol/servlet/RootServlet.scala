package me.geofbot.lol.servlet

import me.geofbot.lol.LoltoolsStack

class RootServlet extends LoltoolsStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

  get("/plain/edit_count/:username") {
    <html>
      <body>
        <p>{params("username")}</p>
      </body>
    </html>
  }

  notFound()

}
