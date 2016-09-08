package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceProducesSound extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceProducesSound currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceProducesSound.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstanceProducesSoundIterator theInstance = (InstanceProducesSoundIterator)findAncestorWithClass(this, InstanceProducesSoundIterator.class);
			pageContext.getOut().print(theInstance.getProducesSound());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for producesSound tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for producesSound tag ");
		}
		return SKIP_BODY;
	}
}

