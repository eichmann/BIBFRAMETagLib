package edu.uiowa.slis.BIBFRAME.Coden;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodenLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CodenLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CodenLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Coden theCoden = (Coden)findAncestorWithClass(this, Coden.class);
			if (!theCoden.commitNeeded) {
				pageContext.getOut().print(theCoden.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Coden for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Coden for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Coden theCoden = (Coden)findAncestorWithClass(this, Coden.class);
			return theCoden.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Coden for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Coden for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Coden theCoden = (Coden)findAncestorWithClass(this, Coden.class);
			theCoden.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Coden for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Coden for label tag ");
		}
	}
}

