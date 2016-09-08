package edu.uiowa.slis.BIBFRAME.Isrc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IsrcLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IsrcLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(IsrcLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Isrc theIsrc = (Isrc)findAncestorWithClass(this, Isrc.class);
			if (!theIsrc.commitNeeded) {
				pageContext.getOut().print(theIsrc.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Isrc for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isrc for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Isrc theIsrc = (Isrc)findAncestorWithClass(this, Isrc.class);
			return theIsrc.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Isrc for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isrc for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Isrc theIsrc = (Isrc)findAncestorWithClass(this, Isrc.class);
			theIsrc.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Isrc for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isrc for label tag ");
		}
	}
}

