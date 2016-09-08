package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Electronic theElectronic = (Electronic)findAncestorWithClass(this, Electronic.class);
			if (!theElectronic.commitNeeded) {
				pageContext.getOut().print(theElectronic.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Electronic theElectronic = (Electronic)findAncestorWithClass(this, Electronic.class);
			return theElectronic.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Electronic for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Electronic theElectronic = (Electronic)findAncestorWithClass(this, Electronic.class);
			theElectronic.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for label tag ");
		}
	}
}

