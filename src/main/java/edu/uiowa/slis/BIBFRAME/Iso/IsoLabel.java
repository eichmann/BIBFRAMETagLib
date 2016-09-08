package edu.uiowa.slis.BIBFRAME.Iso;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IsoLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IsoLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(IsoLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Iso theIso = (Iso)findAncestorWithClass(this, Iso.class);
			if (!theIso.commitNeeded) {
				pageContext.getOut().print(theIso.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Iso for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Iso for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Iso theIso = (Iso)findAncestorWithClass(this, Iso.class);
			return theIso.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Iso for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Iso for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Iso theIso = (Iso)findAncestorWithClass(this, Iso.class);
			theIso.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Iso for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Iso for label tag ");
		}
	}
}

