const express = require("express");
const app = express();
const port = 8000;
const continentRouter = require("./routes/continent");
const fileController = require("./routes/file");
app.use(express.json({ limit: "50mb" }));
app.use(express.urlencoded({ limit: "50mb" }));
app.use("/v1/", continentRouter);
app.use("/v1/", fileController);
app.listen(port, () => {
  console.log("server listen at port " + port);
});
