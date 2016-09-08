package edu.uiowa.slis.BIBFRAME.ContentAsText;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContentAsTextLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContentAsTextLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ContentAsTextLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ContentAsText theContentAsText = (ContentAsText)findAncestorWithClass(this, ContentAsText.class);
			if (!theContentAsText.commitNeeded) {
				pageContext.getOut().print(theContentAsText.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ContentAsText for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContentAsText for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ContentAsText theContentAsText = (ContentAsText)findAncestorWithClass(this, ContentAsText.class);
			return theContentAsText.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ContentAsText for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContentAsText for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ContentAsText theContentAsText = (ContentAsText)findAncestorWithClass(this, ContentAsText.class);
			theContentAsText.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ContentAsText for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContentAsText for label tag ");
		}
	}
}

