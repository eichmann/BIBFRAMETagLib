package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographPerformedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographPerformedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographPerformedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographPerformedAtIterator theMonographPerformedAtIterator = (MonographPerformedAtIterator)findAncestorWithClass(this, MonographPerformedAtIterator.class);
			pageContext.getOut().print(theMonographPerformedAtIterator.getPerformedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

