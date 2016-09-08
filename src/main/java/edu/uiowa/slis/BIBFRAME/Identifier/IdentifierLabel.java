package edu.uiowa.slis.BIBFRAME.Identifier;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IdentifierLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IdentifierLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(IdentifierLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Identifier theIdentifier = (Identifier)findAncestorWithClass(this, Identifier.class);
			if (!theIdentifier.commitNeeded) {
				pageContext.getOut().print(theIdentifier.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Identifier for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identifier for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Identifier theIdentifier = (Identifier)findAncestorWithClass(this, Identifier.class);
			return theIdentifier.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Identifier for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identifier for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Identifier theIdentifier = (Identifier)findAncestorWithClass(this, Identifier.class);
			theIdentifier.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Identifier for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identifier for label tag ");
		}
	}
}

