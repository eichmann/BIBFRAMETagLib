package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaContinuesUnderNewTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaContinuesUnderNewTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaContinuesUnderNewTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaContinuesUnderNewTitleIterator theMultimediaContinuesUnderNewTitleIterator = (MultimediaContinuesUnderNewTitleIterator)findAncestorWithClass(this, MultimediaContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theMultimediaContinuesUnderNewTitleIterator.getContinuesUnderNewTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

