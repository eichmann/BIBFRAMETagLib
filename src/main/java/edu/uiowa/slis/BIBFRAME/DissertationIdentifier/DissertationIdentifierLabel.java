package edu.uiowa.slis.BIBFRAME.DissertationIdentifier;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationIdentifierLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationIdentifierLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationIdentifierLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DissertationIdentifier theDissertationIdentifier = (DissertationIdentifier)findAncestorWithClass(this, DissertationIdentifier.class);
			if (!theDissertationIdentifier.commitNeeded) {
				pageContext.getOut().print(theDissertationIdentifier.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DissertationIdentifier for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DissertationIdentifier for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			DissertationIdentifier theDissertationIdentifier = (DissertationIdentifier)findAncestorWithClass(this, DissertationIdentifier.class);
			return theDissertationIdentifier.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing DissertationIdentifier for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DissertationIdentifier for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			DissertationIdentifier theDissertationIdentifier = (DissertationIdentifier)findAncestorWithClass(this, DissertationIdentifier.class);
			theDissertationIdentifier.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing DissertationIdentifier for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DissertationIdentifier for label tag ");
		}
	}
}

