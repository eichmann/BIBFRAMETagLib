package edu.uiowa.slis.BIBFRAME.CirculationStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CirculationStatusLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CirculationStatusLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CirculationStatusLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CirculationStatus theCirculationStatus = (CirculationStatus)findAncestorWithClass(this, CirculationStatus.class);
			if (!theCirculationStatus.commitNeeded) {
				pageContext.getOut().print(theCirculationStatus.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CirculationStatus for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CirculationStatus for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			CirculationStatus theCirculationStatus = (CirculationStatus)findAncestorWithClass(this, CirculationStatus.class);
			return theCirculationStatus.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing CirculationStatus for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CirculationStatus for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			CirculationStatus theCirculationStatus = (CirculationStatus)findAncestorWithClass(this, CirculationStatus.class);
			theCirculationStatus.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing CirculationStatus for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CirculationStatus for label tag ");
		}
	}
}

