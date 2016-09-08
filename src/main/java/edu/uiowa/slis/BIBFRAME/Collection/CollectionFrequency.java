package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionFrequencyIterator theCollection = (CollectionFrequencyIterator)findAncestorWithClass(this, CollectionFrequencyIterator.class);
			pageContext.getOut().print(theCollection.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for frequency tag ");
		}
		return SKIP_BODY;
	}
}

