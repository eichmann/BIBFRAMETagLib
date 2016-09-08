package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FiniteResource theFiniteResource = (FiniteResource)findAncestorWithClass(this, FiniteResource.class);
			if (!theFiniteResource.commitNeeded) {
				pageContext.getOut().print(theFiniteResource.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			FiniteResource theFiniteResource = (FiniteResource)findAncestorWithClass(this, FiniteResource.class);
			return theFiniteResource.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing FiniteResource for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			FiniteResource theFiniteResource = (FiniteResource)findAncestorWithClass(this, FiniteResource.class);
			theFiniteResource.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for label tag ");
		}
	}
}

