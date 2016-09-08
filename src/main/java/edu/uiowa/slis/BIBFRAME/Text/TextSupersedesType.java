package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextSupersedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextSupersedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextSupersedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextSupersedesIterator theTextSupersedesIterator = (TextSupersedesIterator)findAncestorWithClass(this, TextSupersedesIterator.class);
			pageContext.getOut().print(theTextSupersedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

