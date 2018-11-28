import subprocess
p = subprocess.Popen("./bombillas", stdout=subprocess.PIPE, shell=True)
(output, err) = p.communicate()
p_status = p.wait()
print("Bombillas encendidas", list(map(int, output.decode("utf-8").split('\n')[:-1])))