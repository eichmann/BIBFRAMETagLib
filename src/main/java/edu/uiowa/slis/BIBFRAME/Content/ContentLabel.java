package edu.uiowa.slis.BIBFRAME.Content;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContentLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContentLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ContentLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Content theContent = (Content)findAncestorWithClass(this, Content.class);
			if (!theContent.commitNeeded) {
				pageContext.getOut().print(theContent.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Content for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Content for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Content theContent = (Content)findAncestorWithClass(this, Content.class);
			return theContent.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Content for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Content for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Content theContent = (Content)findAncestorWithClass(this, Content.class);
			theContent.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Content for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Content for label tag ");
		}
	}
}

