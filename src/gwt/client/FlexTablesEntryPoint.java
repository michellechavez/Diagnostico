  package gwt.client;
  
  import com.google.gwt.core.client.EntryPoint;
  import com.google.gwt.user.client.ui.RootPanel;
  import com.google.gwt.user.client.ui.Button;
  import com.google.gwt.user.client.ui.Composite;
  import com.google.gwt.user.client.ui.FlexTable;
  import com.google.gwt.user.client.ui.HasAlignment;
  import com.google.gwt.user.client.ui.TextArea;
  import com.google.gwt.user.client.ui.TextBox;
  

 public class FlexTablesEntryPoint extends Composite implements EntryPoint {
    private final TextBox txtClave = new TextBox();
    {
      txtClave.setVisibleLength(10);
    }
    private final TextBox txtNombre = new TextBox();
    {
      txtNombre.setVisibleLength(10);
    }
    private final TextBox txtLugar = new TextBox();
    {
      txtLugar.setVisibleLength(10);
    }
    private final TextArea txtObservaciones = new TextArea();
    {
     txtObservaciones.setCharacterWidth(15);
      txtObservaciones.setVisibleLines(4);
    }
    private final TextArea txtObservaciones2 = new TextArea();
    {
     txtObservaciones2.setCharacterWidth(15);
      txtObservaciones2.setVisibleLines(4);
    }
    private final TextArea txtAficiones = new TextArea();
    {
      txtAficiones.setCharacterWidth(15);
      txtAficiones.setVisibleLines(4);
    }
    
    public FlexTablesEntryPoint() {
      final FlexTable tabla = new FlexTable();
      // Crea un objeto que permite controlar el formato de las celdas.
      FlexTable.FlexCellFormatter fcf = tabla.getFlexCellFormatter();
      // Separación de 12 pixeles entre los componentes.
      tabla.setCellSpacing(10);
      // Sin borde alrededor de los componentes.
      tabla.setCellPadding(10);
      tabla.setText(0, 0, "Tipo:");
      fcf.setHorizontalAlignment(0, 0, HasAlignment.ALIGN_RIGHT);
      tabla.setWidget(0, 1, txtClave);
      fcf.setColSpan(0, 2, 2);
      fcf.setRowSpan(0, 2, 3);
      fcf.setAlignment(0, 2, HasAlignment.ALIGN_CENTER, HasAlignment.ALIGN_MIDDLE);
      
      //fcf.setHorizontalAlignment(1, 0, HasAlignment.ALIGN_RIGHT);
      tabla.setText(1, 0, "Fecha:");
      fcf.setHorizontalAlignment(1, 0, HasAlignment.ALIGN_RIGHT);
      tabla.setWidget(1, 1, txtNombre);
      //fcf.setHorizontalAlignment(1, 0, HasAlignment.ALIGN_RIGHT);
      tabla.setText(2, 0, "Lugar:");
      fcf.setHorizontalAlignment(2, 0, HasAlignment.ALIGN_RIGHT);
      tabla.setWidget(2, 1, txtLugar);
      
      fcf.setHorizontalAlignment(1, 2, HasAlignment.ALIGN_CENTER);
      tabla.setText(3, 0, "Informacion del Medico:");
      fcf.setAlignment(3, 0, HasAlignment.ALIGN_RIGHT, HasAlignment.ALIGN_TOP);
      tabla.setWidget(3, 1, txtObservaciones);
      
      tabla.setText(4, 0, "Informacion del Paciente:");
      fcf.setAlignment(4, 0, HasAlignment.ALIGN_RIGHT, HasAlignment.ALIGN_TOP);
      tabla.setWidget(4, 1, txtObservaciones2);
      
      tabla.setText(5, 0, "Descripcion del Paciente:");
      fcf.setAlignment(5, 0, HasAlignment.ALIGN_CENTER, HasAlignment.ALIGN_TOP);
      tabla.setWidget(5, 1, txtAficiones);
      
      tabla.setWidget(6, 0, new Button("Aceptar"));
      fcf.setColSpan(6, 0, 4);
      fcf.setHorizontalAlignment(6, 0, HasAlignment.ALIGN_CENTER);
      initWidget(tabla);
   }
   public void onModuleLoad() {
     RootPanel.get().add(this);
   }
 }