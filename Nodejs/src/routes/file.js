const express = require("express");
const router = express.Router();
const fileController = require("../controller/file");
router.post("/files", fileController.writeToFileAsJson);

module.exports = router;
