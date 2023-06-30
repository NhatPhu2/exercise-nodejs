const express = require("express");
const router = express.Router();
const exerciseController = require("../controller/fortyExercise");

router.get("/sum",exerciseController.sumTwoNumber)
router.get("/prime-number",exerciseController.isPrimeNumber)
router.post("/max-number",exerciseController.findMaxNumber)
router.get("/reversion-string",exerciseController.reverseString)
router.get("/palindrome",exerciseController.palindrome)
router.get("/factorial",exerciseController.factorial)
router.post("/even-number",exerciseController.getEvenNumberFromArray)
router.post("/sorting-array",exerciseController.sortAnArray)
module.exports = router