package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextProducedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextProducedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextProducedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextProducedAtIterator theTextProducedAtIterator = (TextProducedAtIterator)findAncestorWithClass(this, TextProducedAtIterator.class);
			pageContext.getOut().print(theTextProducedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

