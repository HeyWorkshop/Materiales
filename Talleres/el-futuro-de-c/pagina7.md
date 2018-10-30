# Utilizando mi módulo en Python
![python logo](https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/Python_logo_and_wordmark.svg/2000px-Python_logo_and_wordmark.svg.png)
En este ejemplo tenemos un programa escrito en Python, el cual utiliza el módulo de C para resolver el problema de las bombillas. Al ejecutar el programa se puede observar como los resultados obtenidos por la rutina de C pueden ser utilizados por Python
```
import subprocess
p = subprocess.Popen("./bombillas", stdout=subprocess.PIPE, shell=True)
(output, err) = p.communicate()
p_status = p.wait()
print("Bombillas encendidas", list(map(int, output.decode("utf-8").split('\n')[:-1])))
```
##### [Anterior](pagina6.md) -- [Inicio](README.md)