package edu.uiowa.slis.BIBFRAME.NamedIndividual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NamedIndividualLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NamedIndividualLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(NamedIndividualLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NamedIndividual theNamedIndividual = (NamedIndividual)findAncestorWithClass(this, NamedIndividual.class);
			if (!theNamedIndividual.commitNeeded) {
				pageContext.getOut().print(theNamedIndividual.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NamedIndividual for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NamedIndividual for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			NamedIndividual theNamedIndividual = (NamedIndividual)findAncestorWithClass(this, NamedIndividual.class);
			return theNamedIndividual.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing NamedIndividual for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NamedIndividual for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			NamedIndividual theNamedIndividual = (NamedIndividual)findAncestorWithClass(this, NamedIndividual.class);
			theNamedIndividual.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing NamedIndividual for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NamedIndividual for label tag ");
		}
	}
}

