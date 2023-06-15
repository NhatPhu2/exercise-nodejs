const writeToFileAsJson = (req, res) => {
  const fs = require("fs");
  const listContinent = JSON.stringify(req.body);
  fs.writeFile("src/fakedata/output.json", listContinent, "utf-8", (error) => {
    if (error) return console.log(error);

    console.log("file has been saved");
  });
  res.send("file has been saved successful");
};

module.exports = {
  writeToFileAsJson,
};
