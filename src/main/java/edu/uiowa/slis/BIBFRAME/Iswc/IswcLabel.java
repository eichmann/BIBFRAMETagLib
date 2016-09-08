package edu.uiowa.slis.BIBFRAME.Iswc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IswcLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IswcLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(IswcLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Iswc theIswc = (Iswc)findAncestorWithClass(this, Iswc.class);
			if (!theIswc.commitNeeded) {
				pageContext.getOut().print(theIswc.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Iswc for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Iswc for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Iswc theIswc = (Iswc)findAncestorWithClass(this, Iswc.class);
			return theIswc.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Iswc for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Iswc for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Iswc theIswc = (Iswc)findAncestorWithClass(this, Iswc.class);
			theIswc.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Iswc for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Iswc for label tag ");
		}
	}
}

