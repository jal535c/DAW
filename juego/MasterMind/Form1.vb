Public Class Form1
    Inherits System.Windows.Forms.Form

#Region " Código generado por el Diseñador de Windows Forms "

    Public Sub New()
        MyBase.New()

        'El Diseñador de Windows Forms requiere esta llamada.
        InitializeComponent()

        'Agregar cualquier inicialización después de la llamada a InitializeComponent()

    End Sub

    'Form reemplaza a Dispose para limpiar la lista de componentes.
    Protected Overloads Overrides Sub Dispose(ByVal disposing As Boolean)
        If disposing Then
            If Not (components Is Nothing) Then
                components.Dispose()
            End If
        End If
        MyBase.Dispose(disposing)
    End Sub

    'Requerido por el Diseñador de Windows Forms
    Private components As System.ComponentModel.IContainer

    'NOTA: el Diseñador de Windows Forms requiere el siguiente procedimiento
    'Puede modificarse utilizando el Diseñador de Windows Forms. 
    'No lo modifique con el editor de código.
    Friend WithEvents Button1 As System.Windows.Forms.Button
    Friend WithEvents Panel1 As System.Windows.Forms.Panel
    Friend WithEvents txtIntentos As System.Windows.Forms.TextBox
    Friend WithEvents txtOut1 As System.Windows.Forms.TextBox
    Friend WithEvents txtOut2 As System.Windows.Forms.TextBox
    Friend WithEvents txtOut3 As System.Windows.Forms.TextBox
    Friend WithEvents txtOut4 As System.Windows.Forms.TextBox
    Friend WithEvents txtIn1 As System.Windows.Forms.TextBox
    Friend WithEvents txtIn2 As System.Windows.Forms.TextBox
    Friend WithEvents txtIn4 As System.Windows.Forms.TextBox
    Friend WithEvents txtIn3 As System.Windows.Forms.TextBox
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents ListBox1 As System.Windows.Forms.ListBox
    Friend WithEvents btnVer As System.Windows.Forms.Button
    Friend WithEvents txtCo1 As System.Windows.Forms.TextBox
    Friend WithEvents txtCo4 As System.Windows.Forms.TextBox
    Friend WithEvents txtCo3 As System.Windows.Forms.TextBox
    Friend WithEvents txtCo2 As System.Windows.Forms.TextBox
    Friend WithEvents Panel2 As System.Windows.Forms.Panel
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents txtTengo As System.Windows.Forms.TextBox
    Friend WithEvents txtOrden As System.Windows.Forms.TextBox
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.txtIn1 = New System.Windows.Forms.TextBox
        Me.txtIn2 = New System.Windows.Forms.TextBox
        Me.Button1 = New System.Windows.Forms.Button
        Me.txtOut1 = New System.Windows.Forms.TextBox
        Me.txtOut2 = New System.Windows.Forms.TextBox
        Me.Panel1 = New System.Windows.Forms.Panel
        Me.txtOut3 = New System.Windows.Forms.TextBox
        Me.txtOut4 = New System.Windows.Forms.TextBox
        Me.txtIntentos = New System.Windows.Forms.TextBox
        Me.txtIn4 = New System.Windows.Forms.TextBox
        Me.txtIn3 = New System.Windows.Forms.TextBox
        Me.Label1 = New System.Windows.Forms.Label
        Me.ListBox1 = New System.Windows.Forms.ListBox
        Me.txtCo1 = New System.Windows.Forms.TextBox
        Me.txtCo4 = New System.Windows.Forms.TextBox
        Me.txtCo3 = New System.Windows.Forms.TextBox
        Me.txtCo2 = New System.Windows.Forms.TextBox
        Me.btnVer = New System.Windows.Forms.Button
        Me.Panel2 = New System.Windows.Forms.Panel
        Me.Label2 = New System.Windows.Forms.Label
        Me.Label3 = New System.Windows.Forms.Label
        Me.txtTengo = New System.Windows.Forms.TextBox
        Me.txtOrden = New System.Windows.Forms.TextBox
        Me.Panel1.SuspendLayout()
        Me.Panel2.SuspendLayout()
        Me.SuspendLayout()
        '
        'txtIn1
        '
        Me.txtIn1.Location = New System.Drawing.Point(80, 32)
        Me.txtIn1.Name = "txtIn1"
        Me.txtIn1.Size = New System.Drawing.Size(40, 20)
        Me.txtIn1.TabIndex = 0
        Me.txtIn1.Text = ""
        '
        'txtIn2
        '
        Me.txtIn2.Location = New System.Drawing.Point(168, 32)
        Me.txtIn2.Name = "txtIn2"
        Me.txtIn2.Size = New System.Drawing.Size(40, 20)
        Me.txtIn2.TabIndex = 1
        Me.txtIn2.Text = ""
        '
        'Button1
        '
        Me.Button1.Location = New System.Drawing.Point(208, 312)
        Me.Button1.Name = "Button1"
        Me.Button1.TabIndex = 2
        Me.Button1.Text = "Probar"
        '
        'txtOut1
        '
        Me.txtOut1.Font = New System.Drawing.Font("Microsoft Sans Serif", 16.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtOut1.Location = New System.Drawing.Point(24, 32)
        Me.txtOut1.Name = "txtOut1"
        Me.txtOut1.Size = New System.Drawing.Size(48, 32)
        Me.txtOut1.TabIndex = 3
        Me.txtOut1.Text = "0"
        '
        'txtOut2
        '
        Me.txtOut2.Font = New System.Drawing.Font("Microsoft Sans Serif", 16.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtOut2.Location = New System.Drawing.Point(112, 32)
        Me.txtOut2.Name = "txtOut2"
        Me.txtOut2.Size = New System.Drawing.Size(48, 32)
        Me.txtOut2.TabIndex = 4
        Me.txtOut2.Text = "0"
        '
        'Panel1
        '
        Me.Panel1.Controls.Add(Me.txtOut1)
        Me.Panel1.Controls.Add(Me.txtOut2)
        Me.Panel1.Controls.Add(Me.txtOut3)
        Me.Panel1.Controls.Add(Me.txtOut4)
        Me.Panel1.Location = New System.Drawing.Point(56, 80)
        Me.Panel1.Name = "Panel1"
        Me.Panel1.Size = New System.Drawing.Size(360, 80)
        Me.Panel1.TabIndex = 6
        '
        'txtOut3
        '
        Me.txtOut3.Font = New System.Drawing.Font("Microsoft Sans Serif", 16.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtOut3.Location = New System.Drawing.Point(192, 32)
        Me.txtOut3.Name = "txtOut3"
        Me.txtOut3.Size = New System.Drawing.Size(48, 32)
        Me.txtOut3.TabIndex = 10
        Me.txtOut3.Text = "0"
        '
        'txtOut4
        '
        Me.txtOut4.Font = New System.Drawing.Font("Microsoft Sans Serif", 16.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtOut4.Location = New System.Drawing.Point(272, 32)
        Me.txtOut4.Name = "txtOut4"
        Me.txtOut4.Size = New System.Drawing.Size(48, 32)
        Me.txtOut4.TabIndex = 11
        Me.txtOut4.Text = "0"
        '
        'txtIntentos
        '
        Me.txtIntentos.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtIntentos.Location = New System.Drawing.Point(304, 312)
        Me.txtIntentos.Name = "txtIntentos"
        Me.txtIntentos.ReadOnly = True
        Me.txtIntentos.Size = New System.Drawing.Size(40, 26)
        Me.txtIntentos.TabIndex = 7
        Me.txtIntentos.Text = "0"
        '
        'txtIn4
        '
        Me.txtIn4.Location = New System.Drawing.Point(328, 32)
        Me.txtIn4.Name = "txtIn4"
        Me.txtIn4.Size = New System.Drawing.Size(40, 20)
        Me.txtIn4.TabIndex = 8
        Me.txtIn4.Text = ""
        '
        'txtIn3
        '
        Me.txtIn3.Location = New System.Drawing.Point(248, 32)
        Me.txtIn3.Name = "txtIn3"
        Me.txtIn3.Size = New System.Drawing.Size(40, 20)
        Me.txtIn3.TabIndex = 9
        Me.txtIn3.Text = ""
        '
        'Label1
        '
        Me.Label1.Location = New System.Drawing.Point(352, 312)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(64, 23)
        Me.Label1.TabIndex = 10
        Me.Label1.Text = "Intentos"
        '
        'ListBox1
        '
        Me.ListBox1.BackColor = System.Drawing.SystemColors.ScrollBar
        Me.ListBox1.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.ListBox1.ItemHeight = 24
        Me.ListBox1.Location = New System.Drawing.Point(464, 112)
        Me.ListBox1.Name = "ListBox1"
        Me.ListBox1.Size = New System.Drawing.Size(144, 268)
        Me.ListBox1.TabIndex = 11
        '
        'txtCo1
        '
        Me.txtCo1.Location = New System.Drawing.Point(24, 16)
        Me.txtCo1.Name = "txtCo1"
        Me.txtCo1.Size = New System.Drawing.Size(40, 20)
        Me.txtCo1.TabIndex = 0
        Me.txtCo1.Text = ""
        '
        'txtCo4
        '
        Me.txtCo4.Location = New System.Drawing.Point(248, 16)
        Me.txtCo4.Name = "txtCo4"
        Me.txtCo4.Size = New System.Drawing.Size(40, 20)
        Me.txtCo4.TabIndex = 8
        Me.txtCo4.Text = ""
        '
        'txtCo3
        '
        Me.txtCo3.Location = New System.Drawing.Point(176, 16)
        Me.txtCo3.Name = "txtCo3"
        Me.txtCo3.Size = New System.Drawing.Size(40, 20)
        Me.txtCo3.TabIndex = 9
        Me.txtCo3.Text = ""
        '
        'txtCo2
        '
        Me.txtCo2.Location = New System.Drawing.Point(104, 16)
        Me.txtCo2.Name = "txtCo2"
        Me.txtCo2.Size = New System.Drawing.Size(40, 20)
        Me.txtCo2.TabIndex = 1
        Me.txtCo2.Text = ""
        '
        'btnVer
        '
        Me.btnVer.Location = New System.Drawing.Point(456, 32)
        Me.btnVer.Name = "btnVer"
        Me.btnVer.TabIndex = 12
        Me.btnVer.Text = "Ver"
        '
        'Panel2
        '
        Me.Panel2.Controls.Add(Me.txtCo1)
        Me.Panel2.Controls.Add(Me.txtCo2)
        Me.Panel2.Controls.Add(Me.txtCo3)
        Me.Panel2.Controls.Add(Me.txtCo4)
        Me.Panel2.Location = New System.Drawing.Point(96, 176)
        Me.Panel2.Name = "Panel2"
        Me.Panel2.Size = New System.Drawing.Size(304, 56)
        Me.Panel2.TabIndex = 13
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(32, 264)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(36, 16)
        Me.Label2.TabIndex = 14
        Me.Label2.Text = "Tengo"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(16, 312)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(50, 16)
        Me.Label3.TabIndex = 15
        Me.Label3.Text = "En orden"
        '
        'txtTengo
        '
        Me.txtTengo.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtTengo.Location = New System.Drawing.Point(80, 256)
        Me.txtTengo.Name = "txtTengo"
        Me.txtTengo.ReadOnly = True
        Me.txtTengo.Size = New System.Drawing.Size(56, 26)
        Me.txtTengo.TabIndex = 16
        Me.txtTengo.Text = ""
        '
        'txtOrden
        '
        Me.txtOrden.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtOrden.Location = New System.Drawing.Point(80, 304)
        Me.txtOrden.Name = "txtOrden"
        Me.txtOrden.ReadOnly = True
        Me.txtOrden.Size = New System.Drawing.Size(56, 26)
        Me.txtOrden.TabIndex = 17
        Me.txtOrden.Text = ""
        '
        'Form1
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(688, 410)
        Me.Controls.Add(Me.txtOrden)
        Me.Controls.Add(Me.txtTengo)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Panel2)
        Me.Controls.Add(Me.btnVer)
        Me.Controls.Add(Me.ListBox1)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.txtIn3)
        Me.Controls.Add(Me.txtIn4)
        Me.Controls.Add(Me.txtIntentos)
        Me.Controls.Add(Me.Panel1)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.txtIn2)
        Me.Controls.Add(Me.txtIn1)
        Me.Name = "Form1"
        Me.Text = "MasterMind 1-8"
        Me.Panel1.ResumeLayout(False)
        Me.Panel2.ResumeLayout(False)
        Me.ResumeLayout(False)

    End Sub

#End Region

    Dim arr(7) As Integer '= {3, 4, 5, 6}
    Dim miarr(3) As TextBox
    Dim micolor(3) As TextBox

    Dim intentos As Integer

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click

        Dim i As Integer
        Dim num1, num2, num3, num4 As Integer
        Dim str As String
        Dim tengo As Integer = 0
        Dim orden As Integer = 0

        num1 = System.Convert.ToInt32(txtOut1.Text)
        num2 = System.Convert.ToInt32(txtOut2.Text)
        num3 = System.Convert.ToInt32(txtOut3.Text)
        num4 = System.Convert.ToInt32(txtOut4.Text)

        'calculo los k tengo
        For i = 0 To 3
            If arr(i) = num1 Then
                'txtCo1.BackColor = Color.Orange
                tengo += 1
            End If

            If arr(i) = num2 Then
                'txtCo2.BackColor = Color.Orange
                tengo += 1
            End If

            If arr(i) = num3 Then
                'txtCo3.BackColor = Color.Orange
                tengo += 1
            End If

            If arr(i) = num4 Then
                'txtCo4.BackColor = Color.Orange
                tengo += 1
            End If
        Next

        'calculo los k tengo en orden
        For i = 0 To 3
            If arr(i) = CInt(miarr(i).Text) Then
                'micolor(i).BackColor = Color.LightGreen
                orden += 1
            End If
        Next

        'limpio el color de los cuadros
        For i = 0 To 3
            micolor(i).BackColor = Color.White
        Next

        'pinto los cuadros 
        If orden <> 0 And orden = tengo Then    'verde: iguales y mayor de cero
            For i = 0 To orden - 1
                micolor(i).BackColor = Color.LightGreen
            Next
        End If

        If orden > 0 And orden < tengo Then     'mixto: mayor a 0 y diferentes
            For i = 0 To orden - 1
                micolor(i).BackColor = Color.LightGreen
            Next
            For i = orden To (orden - 1) + ((tengo - 1) - (orden - 1))
                micolor(i).BackColor = Color.Orange
            Next
        End If

        If tengo <> 0 And orden = 0 Then    'naranja: orden es 0 pero tengo algo
            For i = 0 To tengo - 1
                micolor(i).BackColor = Color.Orange
            Next
        End If

        intentos += 1
        txtIntentos.Text = intentos.ToString
        txtTengo.Text = tengo.ToString
        txtOrden.Text = orden.ToString

        'muestro en el listbox los numeros k voy probando
        str = txtOut1.Text & txtOut2.Text & txtOut3.Text + txtOut4.Text
        ListBox1.Items.Add(str & "   " & txtTengo.Text & " " & txtOrden.Text)

    End Sub

    Private Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

        Dim n, i As Integer

        'asigno los controles a un grupo panel
        Dim controles As System.Windows.Forms.Control.ControlCollection
        controles = Panel1.Controls
        Dim controles2 As System.Windows.Forms.Control.ControlCollection
        controles2 = Panel2.Controls

        For n = 0 To 3
            miarr(n) = CType(controles(n), TextBox)
        Next
        For n = 0 To 3
            micolor(n) = CType(controles2(n), TextBox)
        Next

        'inicia los valores del array
        For i = 0 To 7
            arr(i) = i + 1
        Next

        Desordenar_array(arr)

        'cojo solo los 4 primeros elementos, al azar, podria cojer otros
        txtIn1.Text = arr(0).ToString
        txtIn2.Text = arr(1).ToString
        txtIn3.Text = arr(2).ToString
        txtIn4.Text = arr(3).ToString

        txtIn1.Visible = False
        txtIn2.Visible = False
        txtIn3.Visible = False
        txtIn4.Visible = False

        intentos = 0

    End Sub

    Public Sub Desordenar_array(ByRef vArray() As Integer) ', ByVal startIndex As Integer, ByVal endIndex As Integer)

        Dim i As Integer
        Dim rndIndex As Integer
        Dim Temp As Integer
        Dim startIndex, endIndex As Integer

        Randomize() 'para cambiar el patron de aleatoriedad cada vez

        startIndex = LBound(vArray)
        endIndex = UBound(vArray)

        For i = startIndex To endIndex
            rndIndex = CInt(Int((endIndex - startIndex + 1) * Rnd() + startIndex))
            'Rnd da un numero aleatorio entre 0 y 1
            'Int coge la parte entera y elimina la decimal
            'Cint convierte de single a entero
            Temp = vArray(i)
            vArray(i) = vArray(rndIndex)
            vArray(rndIndex) = Temp
        Next i

    End Sub

    Private Sub btnVer_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnVer.Click

        If btnVer.Text = "Ver" Then

            txtIn1.Visible = True
            txtIn2.Visible = True
            txtIn3.Visible = True
            txtIn4.Visible = True

            btnVer.Text = "Ocultar"

        ElseIf btnVer.Text = "Ocultar" Then

            txtIn1.Visible = False
            txtIn2.Visible = False
            txtIn3.Visible = False
            txtIn4.Visible = False

            btnVer.Text = "Ver"

        End If

    End Sub

    Private Sub txtOut1_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtOut1.Click

        txtOut1.Text = ""

    End Sub

    Private Sub txtOut2_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtOut2.Click

        txtOut2.Text = ""

    End Sub

    Private Sub txtOut3_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtOut3.Click
        txtOut3.Text = ""

    End Sub

    Private Sub txtOut4_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtOut4.Click
        txtOut4.Text = ""

    End Sub
End Class
