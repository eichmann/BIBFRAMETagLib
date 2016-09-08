package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Multimedia theMultimedia = (Multimedia)findAncestorWithClass(this, Multimedia.class);
			if (!theMultimedia.commitNeeded) {
				pageContext.getOut().print(theMultimedia.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Multimedia theMultimedia = (Multimedia)findAncestorWithClass(this, Multimedia.class);
			return theMultimedia.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Multimedia for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Multimedia theMultimedia = (Multimedia)findAncestorWithClass(this, Multimedia.class);
			theMultimedia.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for label tag ");
		}
	}
}

