package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextSupersedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextSupersedes currentInstance = null;
	private static final Log log = LogFactory.getLog(TextSupersedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextSupersedesIterator theTextSupersedesIterator = (TextSupersedesIterator)findAncestorWithClass(this, TextSupersedesIterator.class);
			pageContext.getOut().print(theTextSupersedesIterator.getSupersedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

