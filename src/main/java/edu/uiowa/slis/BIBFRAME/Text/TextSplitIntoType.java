package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextSplitIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextSplitIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextSplitIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextSplitIntoIterator theTextSplitIntoIterator = (TextSplitIntoIterator)findAncestorWithClass(this, TextSplitIntoIterator.class);
			pageContext.getOut().print(theTextSplitIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

