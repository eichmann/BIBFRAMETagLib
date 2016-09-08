package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintAspectRatio extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintAspectRatio currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintAspectRatio.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Print thePrint = (Print)findAncestorWithClass(this, Print.class);
			if (!thePrint.commitNeeded) {
				pageContext.getOut().print(thePrint.getAspectRatio());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Print for aspectRatio tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for aspectRatio tag ");
		}
		return SKIP_BODY;
	}

	public String getAspectRatio() throws JspTagException {
		try {
			Print thePrint = (Print)findAncestorWithClass(this, Print.class);
			return thePrint.getAspectRatio();
		} catch (Exception e) {
			log.error(" Can't find enclosing Print for aspectRatio tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for aspectRatio tag ");
		}
	}

	public void setAspectRatio(String aspectRatio) throws JspTagException {
		try {
			Print thePrint = (Print)findAncestorWithClass(this, Print.class);
			thePrint.setAspectRatio(aspectRatio);
		} catch (Exception e) {
			log.error("Can't find enclosing Print for aspectRatio tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for aspectRatio tag ");
		}
	}
}

