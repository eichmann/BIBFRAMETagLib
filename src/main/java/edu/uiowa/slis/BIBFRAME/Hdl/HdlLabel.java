package edu.uiowa.slis.BIBFRAME.Hdl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HdlLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static HdlLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(HdlLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Hdl theHdl = (Hdl)findAncestorWithClass(this, Hdl.class);
			if (!theHdl.commitNeeded) {
				pageContext.getOut().print(theHdl.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Hdl for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hdl for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Hdl theHdl = (Hdl)findAncestorWithClass(this, Hdl.class);
			return theHdl.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Hdl for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hdl for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Hdl theHdl = (Hdl)findAncestorWithClass(this, Hdl.class);
			theHdl.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Hdl for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hdl for label tag ");
		}
	}
}

