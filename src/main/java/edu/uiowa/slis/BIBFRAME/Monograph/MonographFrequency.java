package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MonographFrequencyIterator theMonograph = (MonographFrequencyIterator)findAncestorWithClass(this, MonographFrequencyIterator.class);
			pageContext.getOut().print(theMonograph.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for frequency tag ");
		}
		return SKIP_BODY;
	}
}

