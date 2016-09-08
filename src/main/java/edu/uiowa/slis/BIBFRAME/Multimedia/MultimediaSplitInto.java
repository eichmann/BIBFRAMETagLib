package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaSplitInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaSplitInto currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaSplitInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaSplitIntoIterator theMultimediaSplitIntoIterator = (MultimediaSplitIntoIterator)findAncestorWithClass(this, MultimediaSplitIntoIterator.class);
			pageContext.getOut().print(theMultimediaSplitIntoIterator.getSplitInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

