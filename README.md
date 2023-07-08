# BARBEARIA-API-SPRINGBOOT-MYSQL

# MELHORIAS;

- [ ] - Swagger Documentation;
- [x] - Error Not Found;
- [ ] - Error data agendamento;
- [ ] - Error agendamento exist;

# Consumir APIS;

## USUARIOS:

<code>LISTAR</code> Todos Usuarios<br>
METHOD: <code>GET</code><br>
URL: http://localhost:8080/api/user<br>
__________________________________________
<code>CONSULTAR</code> Usuario<br>
METHOD: <code>GET</code><br>
URL: http://localhost:8080/api/user/{id}<br>
__________________________________________
<code>DELETAR</code> Usuario<br>
METHOD: <code>DELETE</code><br>
URL: http://localhost:8080/api/user/{id}<br>
__________________________________________
<code>CRIAR</code> Usuario<br>
METHOD: <code>POST</code><br>
URL: http://localhost:8080/api/user<br>
BODY JSON:
<pre>{
  "nome": "SEU-NOME",
  "sobrenome": "SEU-SOBRENOME",
  "email": "SEU-EMAIL",
  "nascimento": "YYYY-MM-DD",
  "telefone": "11 971271472"
}</pre> 
__________________________________________
<code>EDITAR</code> Usuario<br>
METHOD: <code>PUT</code><br>
URL: http://localhost:8080/api/user/{id}<br>
BODY JSON: 
<pre>{
  "id": {id},
  "nome": "SEU-NOME",
  "sobrenome": "SEU-SOBRENOME",
  "email": "SEU-EMAIL",
  "nascimento": "YYYY-MM-DD",
  "telefone": "11 971271472"
}</pre>
__________________________________________
<br>
<br>
<br>

## AGENDAMENTOS:

<code>LISTAR</code> Todos agendamentos<br>
METHOD: <code>GET</code><br>
URL: http://localhost:8080/api/agend<br>
__________________________________________
<code>CONSULTAR</code> agendamento por DATA e HORA<br>
METHOD: <code>GET</code><br>
URL: http://localhost:8080/api/agend/user<br>
BODY JSON: 
<pre>{
    "dataAgend": "YYYY-MM-DD",
    "horaInicio": "HH:MM:00"
}</pre>
__________________________________________
<code>LISTAR</code> todos agendamentos referente ao usuario<br>
METHOD: <code>GET</code><br>
URL: http://localhost:8080/api/agend/agendall<br>
BODY JSON: 
<pre>{
    "emailUsuario": "xxxx@xxxxx.com"
}</pre>
__________________________________________
<code>CRIAR</code> Agendamento<br>
METHOD: <code>POST</code><br>
URL: http://localhost:8080/api/agend<br>
BODY JSON:
<pre>{
    "dataAgend": "YYYY-MM-DD",
    "horaInicio": "HH:MM:00",
    "horaTermino": "HH:MM:00",
    "emailUsuario": "xxxx@xxxxx.com",
    "servicos": [{ID DO SERVIÇO}, {ID DO SERVIÇO OPCIONAL}, {ID DO SERVIÇO OPCIONAL}],
    "pagamento": {
        "pix": boolean,
        "credito": boolean,
        "aprovado": boolean
    }
}</pre> 
__________________________________________
<code>EDITAR</code> Agendamento<br>
METHOD: <code>PUT</code><br>
URL: http://localhost:8080/api/agend/{id}<br>
BODY JSON:
<pre>{
    "dataAgend": "YYYY-MM-DD",
    "horaInicio": "HH:MM:00",
    "horaTermino": "HH:MM:00",
    "emailUsuario": "xxxx@xxxxx.com",
    "servicos": [{ID DO SERVIÇO}, {ID DO SERVIÇO OPCIONAL}, {ID DO SERVIÇO OPCIONAL}],
    "pagamento": {
        "pix": boolean,
        "credito": boolean,
        "aprovado": boolean
    }
}</pre> 
__________________________________________
<code>DELETAR</code> Agendamento<br>
METHOD: <code>DELETE</code><br>
URL: http://localhost:8080/api/agend/{id}<br>
__________________________________________
<br>
<br>
<br>

## SERVIÇOS:

<code>LISTAR</code> Todos Serviços<br>
METHOD: <code>GET</code><br>
URL: http://localhost:8080/api/servico<br>
__________________________________________
CONSULTAR<code>CONSULTAR</code> Serviço por TIPO e MODELO<br>
METHOD: <code>GET</code><br>
URL: http://localhost:8080/api/servico/get<br>
BODY JSON: 
<pre>{
    "tipo": "'CABELO. BARBA, SOMBRANCELHA, ETC'",
    "modelo": "'ESTILO'"
}</pre>
__________________________________________
<code>DELETAR</code> Serviço<br>
METHOD: <code>DELETE</code><br>
URL: http://localhost:8080/api/servico/{id}<br>
__________________________________________
<code>CRIAR</code> Serviço<br>
METHOD: <code>POST</code><br>
URL: http://localhost:8080/api/servico<br>
BODY JSON:
<pre>{
    "tipo": "'CABELO. BARBA, SOMBRANCELHA, ETC'",
    "modelo": "'ESTILO'",
    "duracao": "HH:MM:00",
    "preco": XX.x
}</pre> 
__________________________________________
<code>EDITAR</code> Serviço<br>
METHOD: <code>PUT</code><br>
URL: http://localhost:8080/api/servico/{id}<br>
BODY JSON: 
<pre>{
    "tipo": "'CABELO. BARBA, SOMBRANCELHA, ETC'",
    "modelo": "'ESTILO'",
    "duracao": "HH:MM:00",
    "preco": XX.x
}</pre>
__________________________________________
