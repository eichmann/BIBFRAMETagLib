package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographProducedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographProducedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographProducedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographProducedAtIterator theMonographProducedAtIterator = (MonographProducedAtIterator)findAncestorWithClass(this, MonographProducedAtIterator.class);
			pageContext.getOut().print(theMonographProducedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

