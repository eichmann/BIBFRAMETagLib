package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaContinuesUnderNewTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaContinuesUnderNewTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaContinuesUnderNewTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaContinuesUnderNewTitleIterator theMultimediaContinuesUnderNewTitleIterator = (MultimediaContinuesUnderNewTitleIterator)findAncestorWithClass(this, MultimediaContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theMultimediaContinuesUnderNewTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

